SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt features_check gtk-icon-cache

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen libxcursor libxi xf86-input-libinput"

SRCREV = "58bf697ccee1e03d2b3a002e014375a9645f60b3"
PV = "0.14.1+git${SRCPV}"

FILES_${PN} += " \
    ${datadir}/icons \
    ${datadir}/lxqt/icons \
"
