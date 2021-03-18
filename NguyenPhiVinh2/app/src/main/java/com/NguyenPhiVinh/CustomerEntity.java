package com.NguyenPhiVinh;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "CutomerInformation")
public class CustomerEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "NameCus")
    public String username;

    @ColumnInfo(name = "emailCus")
    public String email;

    @ColumnInfo(name = "phoneCus")
    public String phone;

    @ColumnInfo(name = "genderCus")
    public int gender;
}
