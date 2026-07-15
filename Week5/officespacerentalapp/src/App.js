import office from "./office.png";

function App() {

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image: office
    },
    {
      Name: "SmartWorks",
      Rent: 55000,
      Address: "Hyderabad",
      Image: office
    }
  ];

  return (

    <div style={{ marginLeft: "150px" }}>

      <h1>Office Space , at Affordable Range</h1>

      {

        officeList.map((item, index) => {

          let rentColor = {
            color: item.Rent <= 60000 ? "red" : "green"
          };

          return (

            <div key={index} style={{ marginBottom: "40px" }}>

              <img
                src={item.Image}
                alt="Office Space"
                width="250"
                height="250"
              />

              <h1>Name: {item.Name}</h1>

              <h3 style={rentColor}>
                Rent: Rs. {item.Rent}
              </h3>

              <h3>
                Address: {item.Address}
              </h3>

            </div>

          );

        })

      }

    </div>

  );

}

export default App;