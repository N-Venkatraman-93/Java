package question_1;

import java.io.Serializable;

public class Project implements Serializable {
    public static final long serialVersionUID = 2L;
    String projectCode;
    String projectName;
    int projectStrength;

    public Project(String projectCode, String projectName, int projectStrength) {
        super();
        this.projectCode = projectCode;
        this.projectName = projectName;
        this.projectStrength = projectStrength;
    }
}
