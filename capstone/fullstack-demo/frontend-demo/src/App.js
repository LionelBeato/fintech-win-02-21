import logo from './logo.svg';
import './App.css';
import { useState } from 'react'; 

function App() {

// this is a state hook
// it'll keep track of anything stateful concerning this component
// useState can accept a default value, almost like a placeholder of sorts
  const [state, setState] = useState({id: 0, name: ''});
  
  let myObject = {
    name: 'tony',
  } 

  // i want to refer to the backend
  // there's already a way to access the resource from my backend
  // we will need to use a fetch on the endpoint defined in the backend

  // get the data from the backend
  // we would access the data and configure it through .then() methods

  // render that data to my page
  // we will template in that data in our jsx/html

  const handleFetch = () => {
    fetch(`http://localhost:8080/simple`)
      .then(data => data.json())
      .then(json => setState(json))

  }


  return (
    <main>
      <h1>This is a test</h1>
      <button onClick={handleFetch}>Click me to access backend</button>
      <p>{state.name}</p>
      <p>{state.id}</p>

    </main>
  );
}

export default App;
