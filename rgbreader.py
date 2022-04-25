import tkinter as tk
from tkinter.filedialog import *
from tkinter.simpledialog import *
from ctypes import windll

root = tk.Tk()
root.title('tkinter - Image')

readFp = askopenfilename(parent=root, filetypes=(("모든 그림 파일", "*.jpg;*.jpeg;*.bmp;*.png;"
                                                  "*.tif;*.gif"),("모든 파일","*.*")))
img = tk.PhotoImage(file=readFp)
imglabel = tk.Label(root, image = img)

def click(event):
    dc = windll.user32.GetDC(0)
    rgb = windll.gdi32.GetPixel(dc,event.x_root,event.y_root)
    r = rgb & 0xff
    g = (rgb >> 8) & 0xff
    b = (rgb >> 16) & 0xff
    print ("Mouse position: (x, y) = (%s, %s)" % (event.x, event.y),"RGB = ",r,g,b)
imglabel.bind('<Button-1>', click)

imglabel.pack()
root.bind('<Button-1>', click)
root.mainloop()
