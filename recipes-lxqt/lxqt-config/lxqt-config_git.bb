SUMMARY = "LXQt system settings center"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "qtsvg liblxqt libkscreen"

SRCREV = "b8a6f3a9ba0eed02a3f964eaba2d577a8bb3c89d"
PV = "0.10.0"
SRC_URI += "file://0001-fix-double-prefixed-RPATH.patch"

# there are no dev files / pack liblxqt-config-cursor.so correctly
FILES_${PN} += " \
    ${datadir}/lxqt/icons \
    ${libdir}/liblxqt-config-cursor.so \
"
FILES_${PN}-dev = ""
