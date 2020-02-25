package ctas.test.entity;

public class HardwareDevelopmentWithBLOBs extends HardwareDevelopment {
    private String changeFile;

    private String changeFileAfter;

    private String file;

    public String getChangeFile() {
        return changeFile;
    }

    public void setChangeFile(String changeFile) {
        this.changeFile = changeFile == null ? null : changeFile.trim();
    }

    public String getChangeFileAfter() {
        return changeFileAfter;
    }

    public void setChangeFileAfter(String changeFileAfter) {
        this.changeFileAfter = changeFileAfter == null ? null : changeFileAfter.trim();
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }
}