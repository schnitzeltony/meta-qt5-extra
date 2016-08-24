SUMMARY = "Antimony is a computer-aided design (CAD) tool from a parallel universe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=23;endline=48;md5=9b0a0f10af772bdc7ab3e80c53fc287d"

inherit qmake5 python3native

DEPENDS = "qtbase python3 boost lemon-native"

SRC_URI = " \
    https://github.com/mkeeter/${BPN}/archive/${PV}.tar.gz \
    file://0001-remove-paths-from-python3-config.patch \
    file://0002-hardcode-boost_python3-library-detection-wont-t-work.patch \
    file://0003-align-binary-installation-folders.patch \
    file://0004-do-not-hard-link-to-python-version-we-don-t-have.patch \
    file://0005-v2syntax-add-missing-include.patch \
    file://0006-Change-isinf-to-std-isinf.patch \
"
SRC_URI[md5sum] = "2df03f0a8b6d7db21c24dcf20142297e"
SRC_URI[sha256sum] = "78f22836ede812fa5bb283779ea6ada8568caf76fa4ab0473ee00d2d544b0aa4"

CXXFLAGS += "-I${STAGING_INCDIR}/${PYTHON_DIR}m"

do_configure_append() {
    # binary is in build dir
    sed -i 's:${S}/qt/antimony:${B}/antimony:g' ${B}/Makefile
}
