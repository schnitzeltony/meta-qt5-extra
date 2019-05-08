SUMMARY = "Plugin based library to create window decorations"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-plasma gettext

DEPENDS += " \
    ki18n \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "12e66b250e0e0036e837648f72e94b4e"
SRC_URI[sha256sum] = "33d613b706b83c025675d7d2b20e074219c9a0953a500c306081c24fcf84d99f"
