SUMMARY = "libqtxdg user tools"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fbd65380cdd255951079008b364516c"

inherit lxqt

DEPENDS += " \
    libqtxdg \
"

SRCREV = "bff8e86b229566ba671514a7e170c618a8f881ad"
PV = "3.12.0"

BBCLASSEXTEND = "native"
