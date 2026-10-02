# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

**Student Name:** Robert Haley

**GitHub Repository:** https://github.com/RobertH-gif/BuggyProgram

---

## Commit 1: Initial Commit

**What did you include in this commit?**
The starting BuggyProgram project: BuggyProgram.java with the three buggy methods (getGrade, sumEvenNumbers, sumRange) and the JUnit test files for each task.

**What was the purpose of this commit?**
To save the original project before changing anything, so I had a baseline to compare my fixes against.

---

## Commit 2: Task 1 (getGrade)

**Which tests in Task1Test were failing before your fix?**
Several Task1Test tests failed, mostly the ones checking scores near the grade cutoffs, because the method returned the wrong grade category.

**What was the issue in the code?**
The grade thresholds and conditional logic were wrong, so some scores returned the wrong category, especially at the cutoff scores.

**What change did you make to fix it?**
I fixed the nested if/else so 90 and above returns
