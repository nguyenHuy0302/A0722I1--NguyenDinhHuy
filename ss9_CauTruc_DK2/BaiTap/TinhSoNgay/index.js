var day = document.getElementById("month").value;
function index_day() {
    var month = parseInt(document.getElementById("month").value);
    switch (month) {
        case 1: case 3 : case 7: case 8: case 10 : case 12 :
            document.getElementById("result").innerText = "Tháng "+month+"  có 31 ngày";
            break;
        case 2:
            document.getElementById("result").innerText = "Tháng "+month+" có 28 ngày";
            break;
        case 4: case 6 : case 9: case 11:
            document.getElementById("result").innerText = "Tháng "+month+" có 30 ngày";
            break;

    }
}