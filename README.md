# Java CLI Quiz Application

A simple, interactive **Java console based MCQ (Multiple Choice Questions)** Quiz App.

It asks the user several questions, validates their input, checks correctness, and displays their final score.

---

## 🚀 Features

* CLI based (no GUI needed — runs in terminal)
* Multiple choice questions
* Validates user input (prevents crashes from invalid input)
* Shows correct answer when user selects wrong choice
* Shows final score at the end
* Easy to add more questions

---

## 🛠️ Tech Stack

|            Component | Description                                          |
| -------------------: | ---------------------------------------------------- |
|             Language | Java                                                 |
|              Scanner | Used for user input from console                     |
|     ArrayList / List | Used to store questions                              |
| OOP class `Question` | Encapsulates question text, options and answer index |

---

## 📦 How to Run

### Requirements

* Java 8+ installed
* Terminal / CMD / Powershell

### Steps

1. Save your code in a file named:

```
QuizApp.java
```

2. Compile the application:

```bash
javac QuizApp.java
```

3. Run it:

```bash
java QuizApp
```

---

## 🧠 Adding More Questions

In the `main` method you will see:

```java
List<Question> questions = new ArrayList<>();
```

Each question is added like this:

```java
questions.add(new Question(
    "Your Question Here",
    List.of("Option1", "Option2", "Option3", "Option4"),
    indexOfCorrectAnswer // 0 based
));
```

Example:

```java
questions.add(new Question(
    "Which year was Java released?",
    List.of("1995", "2001", "1989", "2005"),
    0
));
```

`correctOptionIndex` is ZERO BASED, not 1-based.

---

## 🧩 Error Handling Notes

* Prevents invalid input like letters (`a`, `$`, etc.)
* Prevents out-of-range numbers (example `5` when there are only 4 options)

---

## ✅ Output Example

```
--- Welcome to the Java Quiz! ---
Answer the following 4 questions. Good luck!

What keyword is used to create an instance of a class?
1. new
2. this
3. create
4. instance
Enter your choice (1-4): 2
Wrong! The correct answer was: 1. new

...
--- Quiz Finished! ---
Your final score is: 3 out of 4
```

---

## 📄 License

This project is free for personal or educational use.

---

## ✨ Future Improvements (Ideas)

| Idea                        | Description                                    |
| --------------------------- | ---------------------------------------------- |
| JSON / file-based questions | Load questions from external `.json` or `.txt` |
| Random shuffle of questions | Use `Collections.shuffle()`                    |
| Timer per question          | `System.currentTimeMillis()`                   |
| GUI version                 | Swing / JavaFX                                 |
| Score grading               | A / B / C like school test                     |

---

## 🤝 Contributing

Pull requests & forks are welcome — just keep it simple and console-based.

---
