package main.model;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 16.03.14
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 */
public class Sex {
    private Integer sexId;
    private String sexName;

    public Sex(Integer sexId, String sexName) {
        this.sexId = sexId;
        this.sexName = sexName;
    }

    public Sex(String sexName) {
        this.sexName = sexName;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sex) {
        this.sexName = sex;
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Sex)) {
            return false;
        }

        Sex sex = (Sex) o;

        if (!sexName.equals(sex.sexName)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return sexName.hashCode();
    }
}
