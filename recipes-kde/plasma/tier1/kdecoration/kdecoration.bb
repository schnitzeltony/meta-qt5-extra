SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6d297731a17c892d513d6a2b5b721324"
SRC_URI[sha256sum] = "80842366805d38557aac93c747e3a20bcc778dfd41b7fd2fecc96159cb906c11"
