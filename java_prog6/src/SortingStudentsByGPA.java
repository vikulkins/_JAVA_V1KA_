public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Student student1, Student student2){
        if(student1.GPA > student2.GPA) return -1;
        else if(student1.GPA < student2.GPA) return 1;
        else return 0;
    }

    public void quickSort(Student[] students, int left, int right) {
        if (left < right) {
            int temp = partition(students, left, right);
            quickSort(students, left, temp - 1);
            quickSort(students, temp + 1, right);
        }
    }

    public int partition(Student[] students, int left, int right) {
        Student temp = students[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (compare(students[j], temp) < 0) {
                i++;
                Student current = students[i];
                students[i] = students[j];
                students[j] = current;
            }
        }
        Student current = students[i+1];
        students[i+1] = students[right];
        students[right] = current;
        return i + 1;
    }
}
