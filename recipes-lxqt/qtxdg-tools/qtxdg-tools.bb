SUMMARY = "libqtxdg user tools"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += " \
    libqtxdg \
"

SRCREV = "8bf7a47ca014fc404cfda971e92fdf0c0ca50dd6"
PV = "3.10.0"

BBCLASSEXTEND = "native"
