let onBtn = document.querySelector(".switchOn")
let light = document.querySelector('img')

function turnOnLight (){
    light.src="./images/on.jpg"
}
onBtn.addEventListener('click',turnOnLight)

let offBtn = document.querySelector(".switchOff")
let light2 = document.querySelector('img')

function turnOffLight (){
    light2.src="./images/off.jpg"
}
offBtn.addEventListener('click',turnOffLight)
