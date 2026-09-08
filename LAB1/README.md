# Лабораторная работа №1 — Вариант 3 «Ввод и вывод данных»

**Цель:** научиться связывать FXML-интерфейс с Java-контроллером.

**Задание:** пользователь вводит имя и фамилию. После нажатия кнопки «Поприветствовать»
приложение выводит персональное приветствие.

## Структура проекта
```
Lab1_Var3/
├── pom.xml
└── src/main/
    ├── java/
    │   ├── module-info.java
    │   └── kz/atu/lab/
    │       ├── HelloApplication.java
    │       └── HelloController.java
    └── resources/kz/atu/lab/
        └── hello-view.fxml
```

## Как открыть в IntelliJ IDEA

1. Распакуйте архив.
2. IntelliJ IDEA → **Open** → выберите папку `Lab1_Var3` (там, где `pom.xml`). IDEA сама
   определит Maven-проект и подтянет зависимости JavaFX.
3. Скачайте **Scene Builder**: https://gluonhq.com/products/scene-builder/
4. Подключите его в IDEA: **File → Settings → Languages & Frameworks → JavaFX** →
   укажите путь к исполняемому файлу Scene Builder. Теперь при открытии `hello-view.fxml`
   внизу появится вкладка **Scene Builder**.
5. Запуск программы:
   ```
   mvn clean javafx:run
   ```
   или через панель Maven справа: `Lab1_Var3 → Plugins → javafx → javafx:run`.

## Что реализовано

- Два поля ввода: `txtName` (Имя), `txtSurname` (Фамилия)
- Кнопка `btnGreet` («Поприветствовать») с обработчиком `onAction="#onGreetClick"`
- `Label lblResult` для вывода результата
- Проверка: если имя или фамилия не заполнены — выводится сообщение
  «Введите имя и фамилию!»; иначе — «Здравствуйте, Имя Фамилия!»

## Пример работы контроллера

```java
@FXML
protected void onGreetClick() {
    String name = txtName.getText().trim();
    String surname = txtSurname.getText().trim();

    if (name.isBlank() || surname.isBlank()) {
        lblResult.setText("Введите имя и фамилию!");
        return;
    }

    lblResult.setText("Здравствуйте, " + name + " " + surname + "!");
}
```
