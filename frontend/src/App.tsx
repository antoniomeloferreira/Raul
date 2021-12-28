import { useEffect, useState } from 'react';
import './App.css';
import { Authentication, getCurrentUser } from './Authentication/Authentication';
import { RaulApp } from './RaulApp/RaulApp';
import { RaulUser } from './Types/Types';

export const App = (): JSX.Element => {

  const [currentUser, setCurrentUser] = useState<RaulUser>();

  useEffect(() => {

    const raulUser: RaulUser = getCurrentUser();

    if (raulUser) {
        setCurrentUser(raulUser);
    }

  }, []);
  
  return (
    <div className="App">
      {currentUser ? <RaulApp/> : <Authentication/>}
    </div>
  );
}

export default App;
