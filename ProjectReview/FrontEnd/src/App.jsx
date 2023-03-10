import { useState } from 'react'
import {Routes, Route} from "react-router-dom";
import Create from './create.jsx'
import Home from './Home.jsx';
import Edit from './Edit.jsx';
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/form" element={<Create/>} />
        <Route path="/edit/:id" element={<Edit/>} />
      </Routes>
    </div>
  )
}

export default App
