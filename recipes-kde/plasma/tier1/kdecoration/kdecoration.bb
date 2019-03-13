SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "b0cbc29002c38525f06e25926e41ce46"
SRC_URI[sha256sum] = "b04d9e2b454ee61f44e5557764782f3a7c73ace2c1a2076ddbce5e78bf36b7fa"
