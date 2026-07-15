import CourseDetails from "./compo/course";
import BookDetails from "./compo/BookDetails";
import BlogDetails from "./compo/BlogDetails";
import "./App.css";

function App() {

  return (

    <div className="container">

      <div className="column">

        <CourseDetails />

      </div>

      <div className="column">

        <BookDetails />

      </div>

      <div className="column">

        <BlogDetails />

      </div>

    </div>

  );

}

export default App;