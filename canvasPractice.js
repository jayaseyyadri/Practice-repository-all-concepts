var ctx;
var canvas = document.getElementById('test');
var circle= new Path2D();

function draw(e) {
    if (canvas.getContext) {
        var ctx = canvas.getContext('2d');
        canvas.width=window.innerWidth;
        canvas.height=window.innerHeight;
        // ctx.beginPath();
        // ctx.moveTo(lastX,lastY);
        // ctx.lineTo(e.offsetX, e.offsetY);
        // ctx.stroke();
        circle.beginPath();
        circle.moveTo(lastX,lastY);
        circle.arc(e.offsetX,e.offsetY,20,30,180,false);
        [lastX, lastY] = [e.offsetX, e.offsetY];
\        // [lastX, lastY] = [e.offsetX, e.offsetY];
    }
    }

canvas.addEventListener('mousedown', (e) => {
    isDrawing = true;
    [lastX, lastY] = [e.offsetX, e.offsetY];
});

canvas.addEventListener('mousemove', draw);
canvas.addEventListener('mouseup', () => isDrawing = false);
canvas.addEventListener('mouseout', () => isDrawing = false);





var isDrawing=false;
var lastX = 0;
var lastY = 0;
canvas.addEventListener('mousedown', () => isDrawing = true);
canvas.addEventListener('mousemove', draw);
canvas.addEventListener('mouseup', () => isDrawing = false);
canvas.addEventListener('mouseout', () => isDrawing = false);

