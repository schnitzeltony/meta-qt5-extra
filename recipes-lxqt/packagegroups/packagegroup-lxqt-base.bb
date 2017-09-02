SUMMARY = "All lxqt packages for a working system"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS_${PN} = " \
    qtbase-plugins \
    qtimageformats-plugins \
    \
    lxqt-world \
    oxygen-icons \
    \
    openbox \
    openbox-theme-artwiz-boxed \
    openbox-theme-bear2 \
    openbox-theme-clearlooks \
    openbox-theme-clearlooks-3.4 \
    openbox-theme-clearlooks-olive \
    openbox-theme-mikachu \
    openbox-theme-natura \
    openbox-theme-onyx \
    openbox-theme-onyx-citrus \
    openbox-theme-orang \
    openbox-theme-syscrash \
"


