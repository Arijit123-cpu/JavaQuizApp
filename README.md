# Java Quiz Application 🎓

This is a simple quiz application developed using **Java Swing and AWT**. It allows students to take a multiple-choice quiz with a timer. The application includes a login screen, quiz rules, quiz questions and a final score display.
---

## ✨ Features

- 🧑‍🎓 Student name entry (login screen)
- 📋 Rules display before the quiz begins
- ❓ 10 multiple-choice questions
- ⏱️ Countdown timer for each question (15 seconds)
- ✅ Automatic score calculation
- 📊 Final result screen showing the score

---

## 📂 Project Structure

JavaQuizApp/
└── src/
└── quiz/application/
├── Login.java # Launches the app and collects student name
├── Rules.java # Displays quiz rules
├── Quiz.java # Handles question display, timer, answer selection
└── Score.java # Shows final score and feedback

---

## 🚀 How to Run the Application

### 🔧 Option 1: Using Terminal (Java must be installed)

```bash
git clone https://github.com/Arijit123-cpu/JavaQuizApp.git
cd JavaQuizApp
javac -d . src/quiz/application/*.java
java quiz.application.Login
```

💻 Option 2: Using an IDE
  1. Open the project in IntelliJ IDEA, Eclipse or any Java IDE.
  
  2. Navigate to Login.java.
  
  3. Run the file — it will launch the quiz app.

---

🛠️ Technologies Used

  Java
  
  Swing (for GUI design)
  
  AWT (for components and layout)
  
  Object-Oriented Programming (OOP)
  
---
  
## 🚀 Future Improvements

- [ ] Add teacher login and question management panel (add/edit/delete)
- [ ] Load questions from a database using JDBC (or external file as fallback)
- [ ] Save student quiz results along with name and timestamp for records
- [ ] Add a review screen to show correct answers after the quiz
- [ ] Implement input validation on the login screen to prevent empty or invalid name input
