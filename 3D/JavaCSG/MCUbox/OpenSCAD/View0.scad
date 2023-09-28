difference()
{
    linear_extrude(height = 7.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
    {
        scale([36.0, 62.0])
        {
            M8();
        }
    }
    translate([0.0, 0.0, 3.0])
    {
        union()
        {
            union()
            {
                difference()
                {
                    linear_extrude(height = 6.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                    {
                        scale([32.0, 58.5])
                        {
                            M8();
                        }
                    }
                    translate([12.5, 26.0, 0.0])
                    {
                        translate([0.0, 0.0, -1.0])
                        {
                            linear_extrude(height = 8.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                            {
                                scale([2.6, 2.6])
                                {
                                    M52();
                                }
                            }
                        }
                    }
                    translate([-12.5, 26.0, 0.0])
                    {
                        translate([0.0, 0.0, -1.0])
                        {
                            linear_extrude(height = 8.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                            {
                                scale([2.6, 2.6])
                                {
                                    M52();
                                }
                            }
                        }
                    }
                    translate([12.5, -26.0, 0.0])
                    {
                        translate([0.0, 0.0, -1.0])
                        {
                            linear_extrude(height = 8.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                            {
                                scale([2.6, 2.6])
                                {
                                    M52();
                                }
                            }
                        }
                    }
                    translate([-12.5, -26.0, 0.0])
                    {
                        translate([0.0, 0.0, -1.0])
                        {
                            linear_extrude(height = 8.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                            {
                                scale([2.6, 2.6])
                                {
                                    M52();
                                }
                            }
                        }
                    }
                }
                translate([-11.3, 0.0, 0.0])
                {
                    translate([0.0, 0.0, -10.0])
                    {
                        linear_extrude(height = 11.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                        {
                            scale([3.0, 38.4])
                            {
                                M8();
                            }
                        }
                    }
                }
                translate([11.3, 0.0, 0.0])
                {
                    translate([0.0, 0.0, -10.0])
                    {
                        linear_extrude(height = 11.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                        {
                            scale([3.0, 38.4])
                            {
                                M8();
                            }
                        }
                    }
                }
            }
            translate([0.0, 38.75, 0.0])
            {
                translate([0.0, 0.0, 0.0])
                {
                    linear_extrude(height = 6.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
                    {
                        scale([12.0, 21.0])
                        {
                            M8();
                        }
                    }
                }
            }
        }
    }
}

module M52()
{
    polygon
    (
        points =
        [
            [0.5, 0.0], 
            [0.4903926402016152, 0.09754516100806412], 
            [0.46193976625564337, 0.1913417161825449], 
            [0.4157348061512726, 0.2777851165098011], 
            [0.3535533905932738, 0.35355339059327373], 
            [0.27778511650980114, 0.4157348061512726], 
            [0.19134171618254492, 0.46193976625564337], 
            [0.09754516100806417, 0.4903926402016152], 
            [3.061616997868383E-17, 0.5], 
            [-0.0975451610080641, 0.4903926402016152], 
            [-0.19134171618254486, 0.46193976625564337], 
            [-0.277785116509801, 0.41573480615127273], 
            [-0.35355339059327373, 0.3535533905932738], 
            [-0.4157348061512727, 0.2777851165098011], 
            [-0.46193976625564337, 0.19134171618254495], 
            [-0.4903926402016152, 0.0975451610080643], 
            [-0.5, 6.123233995736766E-17], 
            [-0.4903926402016152, -0.09754516100806418], 
            [-0.4619397662556434, -0.19134171618254484], 
            [-0.41573480615127273, -0.277785116509801], 
            [-0.35355339059327384, -0.35355339059327373], 
            [-0.2777851165098011, -0.4157348061512726], 
            [-0.19134171618254517, -0.46193976625564326], 
            [-0.09754516100806433, -0.49039264020161516], 
            [-9.184850993605148E-17, -0.5], 
            [0.09754516100806415, -0.4903926402016152], 
            [0.191341716182545, -0.4619397662556433], 
            [0.2777851165098009, -0.41573480615127273], 
            [0.3535533905932737, -0.35355339059327384], 
            [0.4157348061512726, -0.2777851165098011], 
            [0.46193976625564326, -0.1913417161825452], 
            [0.49039264020161516, -0.09754516100806436]
        ],
        paths =
        [
            [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31]
        ]
    );
}

module M8()
{
    polygon
    (
        points =
        [
            [-0.5, -0.5], 
            [0.5, -0.5], 
            [0.5, 0.5], 
            [-0.5, 0.5]
        ],
        paths =
        [
            [0, 1, 2, 3]
        ]
    );
}
