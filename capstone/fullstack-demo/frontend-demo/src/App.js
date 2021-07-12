import logo from './logo.svg';
import './App.css';
import { useState } from 'react'; 
import btoa from 'btoa';

function App() {

  // this is a state hook
  // it'll keep track of anything stateful concerning this component
  // useState can accept a default value, almost like a placeholder of sorts
  const [state, setState] = useState({id: 0, name: ``});
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  

  
  // simple object for use later
  let myObject = {
    id: 76,
    name: `Tony`,
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
        'Content-Type': `application/json`
      },
      body: JSON.stringify(myObject),
    })
    .then(data => data.json())
    .then(json => console.log(json))
  }

  const handleCreds = () => {
    fetch(`http://localhost:8080/greeting`, {
      method: `GET`, 
      headers: {
          "Authorization": `Basic ${localStorage.getItem('encodedUser')}` 
      }
    })
    .then(data => data.text())
    .then(text => console.log(text))
  }

  const handleSubmit = (event) => {
    event.preventDefault();

    let credentials = {
      username: username,
      password: password
    }

    let encodedUser = btoa(`${credentials.username}:${credentials.password}`); 

    console.log(encodedUser);
    localStorage.setItem('encodedUser', encodedUser)
    // console.log(pass)

    console.log(localStorage.getItem('encodedUser'))

  }

  return (
    <main>
      <h1>This is a test</h1>
      <button onClick={handleFetch}>Click me to access backend</button>
      <button onClick={handlePost}>Click me to send Tony to the backend</button>
      <button onClick={handleCreds}>This will work!</button>


      {/* Note that React will not allow allow objects  */}
      <p>{state.name}</p>
      <p>{state.id}</p>

      <form onSubmit={handleSubmit}>
        <label>
        Username:
        <input type="text" value={username} onChange={ e => setUsername(e.target.value)} />
        </label>
        <label>
        Password:
        <input type="text" value={password} onChange={ e => setPassword(e.target.value)} />
        </label>
        <input type="submit" value="Submit" />
      </form>
    </main>
  );
}

export default App;
