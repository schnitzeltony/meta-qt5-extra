SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "760a3befb55726b8de5b33ccaf3264c5"
SRC_URI[sha256sum] = "a20d496705c51d2fa5fcbbe12ef29457b807438f7aaaab7670db6fa5417993d7"
