SUMMARY = "Qt platform theme plugin for apps integration with Liri "
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

DEPENDS += " \
    qtquickcontrols2 \
    liri-qtgsettings \
"

PV = "1.0.0+git${SRCPV}"

SRCREV = "fa9bdf9f4efb494e3a5703f33c990013e4d5a99b"
S = "${WORKDIR}/git"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"
