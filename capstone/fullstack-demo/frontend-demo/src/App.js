import logo from './logo.svg';
import './App.css';
import { useState } from 'react'; 

function App() {

// this is a state hook
// it'll keep track of anything stateful concerning this component
// useState can accept a default value, almost like a placeholder of sorts
  const [state, setState] = useState({id: 0, name: ''});
  
  // simple object for use later
  let myObject = {
    id: 76,
    name: 'Tony',
  } 

  // i want to refer to the backend
  // there's already a way to access the resource from my backend
  // we will need to use a fetch on the endpoint defined in the backend

  // get the data from the backend
  // we would access the data and configure it through .then() methods

  // render that data to my page
  // we will template in that data in our jsx/html

  // here fetch is behaving like a GET request  
  // this is the default behavior of the fetch method
  const handleFetch = () => {
    fetch(`http://localhost:8080/simple`)
      .then(data => data.json())
      .then(json => setState(json))

  }

  // handlePost will commit the POST method as opposed to the regular GET 
  // to define a post, we pass an addition argument to our fetch method
  // this argument will be an object that represents options for our request
  const handlePost = () => {
    fetch(`http://localhost:8080/post`, {
      method: `POST`,
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(myObject),
    })
    .then(data => data.json())
    .then(json => console.log(json))
  }


  return (
    <main>
      <h1>This is a test</h1>
      <button onClick={handleFetch}>Click me to access backend</button>
      <button onClick={handlePost}>Click me to send Tony to the backend</button>

      <p>{state.name}</p>
      <p>{state.id}</p>

    </main>
  );
}

export default App;
