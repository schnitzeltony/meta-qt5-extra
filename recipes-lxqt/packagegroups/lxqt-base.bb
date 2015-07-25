SUMMARY = "All lxqt packages for a working system"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    lxqt-world \
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


