const res = document.getElementById("result") //find the element in the html

printBox = ()=>{
  let width = prompt("Input width: ")
  let height = prompt("Input height: ")
  res.innerHTML = "";
  
  for(let i=0; i<height; i++){
    let line = document.createElement("p");  //make a new html element
    line.setAttribute("style", "margin-bottom: 0;");

    line.innerHTML = "&#9899;".repeat(width);
    res.append(line); //add content to inside the selected element
  }
}

printCheck = ()=>{
  let width = prompt("Input width: ")
  let height = prompt("Input height: ")
  res.innerHTML = "";
  
  for(let i=1; i<=height; i++){
    let line = document.createElement("p");
    line.setAttribute("style", "margin-bottom: 0;");
    
    if(i%2 == 0){
      line.innerHTML = "&#9898;&#9899;".repeat(width/2);
      if(width%2 == 1){
        line.innerHTML = line.innerHTML + ("&#9898;")
      }
    } else {
      line.innerHTML = "&#9899;&#9898;".repeat(width/2);
      if(width%2 == 1){
        line.innerHTML = line.innerHTML + ("&#9899;")
      }
    }
    res.append(line);
  }
}

printCross = ()=>{
  let size = prompt("Input size: ")
  res.innerHTML = "";

  for(let i=0; i<size; i++){
    let line = document.createElement("p");
    line.setAttribute("style", "margin-bottom: 0;");
    let string = "";

    for(let j=0; j<size; j++){
      if(i==j || i+j == (size-1)){
        string += "&#9899;"
      }else{
        string += "&#9898;"
      }
    }

    line.innerHTML = string;
    res.append(line);
  }
}

printLTri = ()=>{
  let size = prompt("Input size: ")
  res.innerHTML = "";

  for(let i=1; i<=size; i++){
    let line = document.createElement("p");
    line.setAttribute("style", "margin-bottom: 0;");
    line.innerHTML = "&#9899;".repeat(i)

    res.append(line);
  }
}

printUTri = ()=>{
  let size = prompt("Input size: ")
  res.innerHTML = "";

  for(let i=size; i>=1; i--){
    let line = document.createElement("p");
    line.setAttribute("style", "margin-bottom: 0;");
    line.innerHTML = "&#9899;".repeat(i)

    res.append(line);
  }
}

printDTrap = ()=>{
  let width = prompt("Input width: ");
  let height = prompt("Input height: ");
  res.innerHTML = "";

  if(Math.floor(width/2) < height){
    res.innerHTML = `Impossible Shape! A trapezoid of width ${width} can only be ${Math.floor(width/2)} tall`
  }else{
    let num = width
    for(let i=0; i<height; i++){
      if(num>1){
        let line = document.createElement("p");
        line.setAttribute("style", "margin-bottom: 0;");
        line.innerHTML = "&#9899;".repeat(num)
        
        res.append(line);
        num = num -2;

      }
    }

  }
}