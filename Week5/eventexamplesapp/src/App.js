import React, { Component } from "react";

class App extends Component {

  constructor() {
    super();

    this.state = {
      count: 1,
      amount: 80,
      currency: "Euro"
    };
  }

  // Increment Counter
  increment = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  // Decrement Counter
  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  // Say Hello
 sayHello = () => {
    alert("Hello! Member!");
};

  // Increment + Hello
  incrementValue = () => {
    this.increment();
    this.sayHello();
  };

  // Welcome
  sayWelcome = (msg) => {
    alert(msg);
  };

  // Synthetic Event
  handlePress = () => {
    alert("I was clicked");
};

  // Currency Convertor
  handleSubmit = () => {

    const euro = this.state.amount * 80;

    alert("Converting to Euro Amount is " + euro);

  };

  render() {

    return (

      <div style={{ margin: "20px" }}>

        <h3>{this.state.count}</h3>

        <button onClick={this.incrementValue}>
          Increment
        </button>

        <br /><br />

        <button onClick={this.decrement}>
          Decrement
        </button>

        <br /><br />
<button onClick={() => this.sayWelcome("welcome")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.handlePress}>
          Click on me
        </button>

        <br /><br /><br />

        <h1 style={{ color: "green" }}>
          Currency Convertor!!!
        </h1>

        <table>

          <tbody>

            <tr>

              <td>Amount:</td>

              <td>

                <input
                  type="number"
                  value={this.state.amount}
                  onChange={(e) =>
                    this.setState({ amount: e.target.value })
                  }
                />

              </td>

            </tr>

            <tr>

              <td>Currency:</td>

              <td>

                <select
                  value={this.state.currency}
                  onChange={(e) =>
                    this.setState({ currency: e.target.value })
                  }
                >

                  <option>Euro</option>

                </select>

              </td>

            </tr>

            <tr>

              <td></td>

              <td>

                <button onClick={this.handleSubmit}>
                  Submit
                </button>

              </td>

            </tr>

          </tbody>

        </table>

      </div>

    );

  }

}

export default App;