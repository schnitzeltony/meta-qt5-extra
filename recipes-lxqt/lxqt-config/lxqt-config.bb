SUMMARY = "LXQt system settings center"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor libxi xf86-input-libinput lxqt-menu-data"

SRCREV = "cb833337089718a5e0a5addcb9f610929edb39e2"
PV = "1.4.0"

FILES:${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
    ${datadir}/desktop-directories \
"
