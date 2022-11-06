SUMMARY = "libqtxdg user tools"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

inherit lxqt

DEPENDS += " \
    libqtxdg \
"

SRCREV = "8bf7a47ca014fc404cfda971e92fdf0c0ca50dd6"
PV = "3.10.0"

BBCLASSEXTEND = "native"
