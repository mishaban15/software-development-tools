val employeeId = 6143
val firstName = "Joe"
val surname = "Soap"
val department = "Computer Services"
val jobTitle = "Technician"

val hourlyRate = 26.87
val hoursWorked = 39
val overtimeHours = 4

val bonusPercentage = 4.5
val taxRatePercentage = 23.5
val pensionContributionPercentage = 6.7


fun main() {
    println("Pay Slip Printer")
    printPaySlip()
}

// I used these links to check how to format money to 2 decimal places:
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/format.html
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html

fun printPaySlip() {

    val normalPay = hoursWorked * hourlyRate
    val overtimePay = overtimeHours * hourlyRate * 1.5

    val grossPay = normalPay + overtimePay

    val bonus = grossPay * bonusPercentage / 100
    val taxDeduction = grossPay * taxRatePercentage / 100
    val pensionDeduction = grossPay * pensionContributionPercentage / 100

    val netPay = grossPay + bonus - taxDeduction - pensionDeduction

    println("============================================")
    println("                 PAYSLIP")
    println("============================================")

    println("Employee ID     : $employeeId")
    println("Employee        : ${firstName.uppercase()} ${surname.uppercase()} ($employeeId)")
    println("Job / Dept      : $jobTitle ($department)")

    println("--------------------------------------------")

    println("Hourly Rate     : €${"%.2f".format(hourlyRate)}")
    println("Hours Worked    : $hoursWorked")
    println("Overtime Hours  : $overtimeHours")

    println("--------------------------------------------")

    println("Normal Pay      : €${"%.2f".format(normalPay)}")
    println("Overtime Pay    : €${"%.2f".format(overtimePay)}")
    println("Gross Pay       : €${"%.2f".format(grossPay)}")
    println("Bonus           : €${"%.2f".format(bonus)}")
    println("Tax Deduction   : €${"%.2f".format(taxDeduction)}")
    println("Pension Deduction: €${"%.2f".format(pensionDeduction)}")

    println("--------------------------------------------")

    println("Net Pay         : €${"%.2f".format(netPay)}")

    println("============================================")
}