SUMMARY = "All kde packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# kpmcore packages get dynamically renamed
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    kf5-world \
    plasma-world \
    kde-apps-world \
    \
    kpmcore \
    phonon \
    ${@bb.utils.contains("DISTRO_FEATURES", "polkit", "polkit-qt-1", "",d)} \
    qca \
"



