function IndianPlayers() {

    const players = [
        "Sachin1",
        "Dhoni2",
        "Virat3",
        "Rohit4",
        "Yuvaraj5",
        "Raina6"
    ];

    const [first, second, third, fourth, fifth, sixth] = players;

    const oddPlayers = [first, third, fifth];
    const evenPlayers = [second, fourth, sixth];

    const T20players = [
        "Mr. First Player",
        "Mr. Second Player",
        "Mr. Third Player"
    ];

    const RanjiPlayers = [
        "Mr. Fourth Player",
        "Mr. Fifth Player",
        "Mr. Sixth Player"
    ];

    const mergedPlayers = [...T20players, ...RanjiPlayers];

    return (
        <div>

            <h1>Odd Players</h1>

            <ul>
                <li>First : {oddPlayers[0]}</li>
                <li>Third : {oddPlayers[1]}</li>
                <li>Fifth : {oddPlayers[2]}</li>
            </ul>

            <hr />

            <h1>Even Players</h1>

            <ul>
                <li>Second : {evenPlayers[0]}</li>
                <li>Fourth : {evenPlayers[1]}</li>
                <li>Sixth : {evenPlayers[2]}</li>
            </ul>

            <hr />

            <h1>List of Indian Players Merged:</h1>

            <ul>
                {mergedPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

        </div>
    );

}

export default IndianPlayers;