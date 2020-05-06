SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "d81cb7833db2169952c46a468b36b630"
SRC_URI[sha256sum] = "f09856245f2cb08d9013da4c3128b5438f1e2f58af40031eb547ae765f57a9c8"
