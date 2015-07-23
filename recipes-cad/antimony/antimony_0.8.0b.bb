SUMMARY = "Antimony is a computer-aided design (CAD) tool from a parallel universe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=23;endline=48;md5=42ef7697397331e7aa0d2251830f3df3"

inherit qmake5 python3native

DEPENDS = "qtbase python3 boost lemon"

SRC_URI = " \
    https://github.com/mkeeter/${BPN}/archive/${PV}.tar.gz \
    file://0001-remove-paths-from-python3-config.patch \
    file://0002-hardcode-boost_python3-library-detection-wont-t-work.patch \
    file://0003-align-binary-installation-folders.patch \
"
SRC_URI[md5sum] = "22e632ffb9351ac9deb6db6be933c433"
SRC_URI[sha256sum] = "24d26c513e3d7abfe89a14cf8c2fc4dc0ff6e35581efdfa4721946deb353804c"

QMAKE_PROFILES = "${S}/qt/${BPN}.pro"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}m"

do_configure_append() {
    # binary is in build dir
    sed -i 's:${S}/qt/antimony:${B}/antimony:g' ${B}/Makefile
}
