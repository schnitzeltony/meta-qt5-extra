SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt pkgconfig distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache"

SRCREV = "c02fc4b867aaa7e7772730420c3635e858db1b5f"
PV = "0.9.0+git${SRCPV}"

# REVISIT: These are poluted by host paths
FILES_${PN}-dev += "${datadir}/lxqt/lxqt-runner/*.cmake"
