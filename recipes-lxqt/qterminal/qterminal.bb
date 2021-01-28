SUMMARY = "Lightweight terminal emulator written in Qt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4641e94ec96f98fabc56ff9cc48be14b"

inherit lxqt qt5-translation gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtermwidget qtx11extras"

SRCREV = "a883c26f7315e24559393f63190453c98c9df947"
PV = "0.16.1"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/appdata \
"
