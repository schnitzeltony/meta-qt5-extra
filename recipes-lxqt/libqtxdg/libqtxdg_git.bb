SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

# libmagic is supplied by file
DEPENDS += "file"

SRC_URI += "file://0001-xdgdesktopfile-handle-Path-entry-for-working-directo.patch"
SRCREV = "b65a324bcd2fc498f8a01eb56dfb54ae05e9b0b2"
PV = "1.3.0"
