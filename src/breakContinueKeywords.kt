
fun main(args: Array<String>) {
    // simple software for selecting admitted students out of a list of prospective students
    data class Student(val name: String, val age: Int, val school: String)
    val prospectiveStudents: ArrayList<Student> = ArrayList()
    val admittedStudents: ArrayList<Student> = ArrayList()

    prospectiveStudents.add(Student("Daniel Martinez", 12, "Hogwarts")) // add student to prospectiveStudents list
    prospectiveStudents.add(Student("Jane Systrom", 22, "Harvard"))
    prospectiveStudents.add(Student("Matthew Johnson", 22, "University of Maryland"))
    prospectiveStudents.add(Student("Jide Sowade", 18, "University of Ibadan"))
    prospectiveStudents.add(Student("Tom Hanks", 25, "Howard University"))

    for (student in prospectiveStudents) {
        if (student.age < 16) {
            continue // skip if age of student less than 16 - too young to be admitted
        }
    admittedStudents.add(student)
        if (admittedStudents.size >= 3) {
            break // breaks out of loop, no further iterations done
        }
    }
    println(admittedStudents)
}