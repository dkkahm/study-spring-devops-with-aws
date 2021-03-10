#!/bin/sh

DEPLOYFILE='/home/ec2-user/target/demo4.jar'

if [ -f "$DEPLOYFILE" ];  then
    rm -f $DEPLOYFILE
fi