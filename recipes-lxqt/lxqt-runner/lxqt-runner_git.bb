SUMMARY = "Tool used to launch programs quickly by typing their names "
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt pkgconfig distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtscript libqtxdg lxqt-globalkeys menu-cache muparser"

SRCREV = "ef1f1e83a5f168657dc8197a09a82ac2a10060ec"
PV = "0.12.0"

# REVISIT: These are poluted by host paths
FILES_${PN}-dev += "${datadir}/lxqt/lxqt-runner/*.cmake"
