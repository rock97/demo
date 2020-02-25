   public void createProcessOnly() throws Exception {
        // 测试用例所需,实际不用写该行代码
        Tracer.serverRecv(new TraceParam(""));

        // 设置流程定义key，该值是bpmn文件中的流程定义key
        ProcessInstanceCreateRequest processInstanceCreateRequest = new ProcessInstanceCreateRequest();
        processInstanceCreateRequest.setProcessDefinitionKey("mobike_lizhihua_shjf");

        // BusinessKey为业务上跟流程这边的任务相关联的唯一键，可能是业务上某个工单的唯一值 mobike_lizhihua_reconsider_applay
        processInstanceCreateRequest.setBusinessKey("mobike_lizhihua_shjf3");

        // 设置变量，可以设置多个
        processInstanceCreateRequest.addToVariables(VariableUtils.buildVariableStruct("repeatApprovePass", 0));
        processInstanceCreateRequest.addToVariables(VariableUtils.buildVariableStruct("approvePass", 0));

        // 设置当前调用者，如果无法获取，可以设置为空
        gravityThriftService.setCurrentUser("DX1389985");
        gravityThriftService.createProcessInstance(processInstanceCreateRequest);

    }


    @Test
    public void completeTaskTest() throws Exception {
        // 测试用例所需,实际不用写该行代码
        Tracer.serverRecv(new TraceParam(""));

        // 设置流程定义key，该值是bpmn文件中的流程定义key
        ProcessInstanceCreateRequest processInstanceCreateRequest = new ProcessInstanceCreateRequest();
        processInstanceCreateRequest.setProcessDefinitionKey("mobike_lizhihua_shjf");

        // BusinessKey为业务上跟流程这边的任务相关联的唯一键，可能是业务上某个工单的唯一值 mobike_lizhihua_reconsider_applay
        processInstanceCreateRequest.setBusinessKey("mobike_lizhihua_shjf1");
        Map<String,VariableStruct> variables = new HashMap<>();
        // 传入变量
        variables.put("repeatApprovePass", VariableUtils.buildVariableStruct("repeatApprovePass", 0));
        variables.put("approvePass", VariableUtils.buildVariableStruct("approvePass", 0));
        Thread.sleep(1000);
        TaskActionRequest actionRequest = new TaskActionRequest();
        // 设置任务处理人，一般第一个节点为流程启动者
        actionRequest.setAssignee("DX1389985");
        //gravityThriftService.completeTaskByBizKey("mobike_lizhihua_shjf", "mobike_lizhihua_applay","mobike_lizhihua_shjf3" ,variables);
        //gravityThriftService.completeTaskByBizKey("mobike_lizhihua_shjf", "mobike_lizhihua_reconsider","mobike_lizhihua_shjf3" ,variables);
        gravityThriftService.completeTaskByBizKey("mobike_lizhihua_shjf", "mobike_lizhihua_reconsider_applay","mobike_lizhihua_shjf3" ,variables);
    }