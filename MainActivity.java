import { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

export default function App() {
  const courses = [
    "Programowanie w C#",
    "Angular dla początkujących",
    "Kurs Django",
  ];

  const [name, setName] = useState("");
  const [courseNumber, setCourseNumber] = useState("");

  const saveCourse = (e) => {
    e.preventDefault();

    const index = Number(courseNumber) - 1;

    console.log(name);

    if (courses[index]) {
      console.log(courses[index]);
    } else {
      console.log("Nieprawidłowy numer kursu");
    }
  };

  return (
    <div className="container mt-5">
      <h1>Liczba kursów: {courses.length}</h1>

      <ol>
        {courses.map((course, index) => (
          <li key={index}>{course}</li>
        ))}
      </ol>

      <form onSubmit={saveCourse} className="mt-4">
        <div className="mb-3">
          <label className="form-label">Imię i nazwisko:</label>

          <input
            type="text"
            className="form-control"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>

        <div className="mb-3">
          <label className="form-label">Numer kursu:</label>

          <input
            type="number"
            className="form-control"
            value={courseNumber}
            onChange={(e) => setCourseNumber(e.target.value)}
          />
        </div>

        <button type="submit" className="btn btn-primary">
          Zapisz do kursu
        </button>
      </form>
    </div>
  );
}