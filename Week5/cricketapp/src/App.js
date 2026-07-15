import PlayerList from "./playerlist";
import IndianPlayers from "./indianplayers";

function App() {

  const flag = false;

  if (flag) {
    return <PlayerList />;
  }
  else {
    return <IndianPlayers />;
  }

}

export default App;