package org.online.com;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Enrollment {
    private int enrollmentId;
    private int userId;
    private int courseId;

    @Override
    public String toString() {
        return "User: " + userId + " was enrolled for the course: " + courseId;
    }
}
