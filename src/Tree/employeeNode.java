package Tree;

class employeeNode {
    employeeNode left;
    employeeNode right;
    boolean rightthread;
    employeeNode(String name,int duration,int salary,String dept){
        employee obj = new employee(name, dept, duration, salary);
    }


}
class employee{
    String name;
    String dept;
    int duration;
    int salary;
    employee(String name,String dept,int duration,int salary){
        this.name=name;
        this.duration=duration;
        this.salary=salary;
        this.dept=dept;
    }
}
