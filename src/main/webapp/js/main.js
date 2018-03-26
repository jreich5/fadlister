{
    "use strict";

    const numberOfItems = document.querySelectorAll("nav li").length;

    let li_num_for_margin;
    let li_num_for_noBorder;

    switch (numberOfItems) {
        case 4:
            li_num_for_margin = 3;
            li_num_for_noBorder = 2;
            break;
        case 6:
            li_num_for_margin = 5;
            li_num_for_noBorder = 4;
            break;
    }

    document.querySelector(`nav li:nth-of-type(${li_num_for_margin})`).style["margin-left"] = "auto";
    document.querySelector(`nav li:nth-of-type(${li_num_for_noBorder}) a`).style["border-right"] = "none";

}



