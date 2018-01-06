# translations -> locale packages

DEPENDS += "qttools-native"

# default location
QT_TRANSLATION_FILES ??= "${datadir}/*/translations/*.qm ${datadir}/*/translations/*/*.qm ${datadir}/*/translations/*/*/*.qm"

FILES_${PN}-locale = "${datadir}/*/translations"

# remove ${datadir}/${BPN} set by bitbake.conf
FILES_${PN}_remove = "${datadir}/${BPN}"

python qt_do_split_locales() {
    import glob

    if (d.getVar('PACKAGE_NO_LOCALE', True) == '1'):
        bb.debug(1, "package requested not splitting locales")
        return

    packages = (d.getVar('PACKAGES', True) or "").split()

    datadir = d.getVar('datadir', True)
    if not datadir:
        bb.note("datadir not defined")
        return

    dvar = d.getVar('PKGD', True)
    pn = d.getVar('LOCALEBASEPN', True)

    if pn + '-locale' in packages:
        packages.remove(pn + '-locale')

    # extract locales from *.qm files into list in locales
    locales = []
    for transvar in d.getVar('QT_TRANSLATION_FILES', True).split():
        translocation = '%s%s' % (dvar, transvar)
        transfiles = glob.glob(translocation)
        for l in sorted(transfiles):
            lib, locale = os.path.basename(l.replace('.qm', '')).split("_",1)
            if not locale in locales:
                locales.append(locale)

    if not locales:
        bb.debug(1, "No locale files in this package")
        return

    summary = d.getVar('SUMMARY', True) or pn
    description = d.getVar('DESCRIPTION', True) or ""
    locale_section = d.getVar('LOCALE_SECTION', True)
    mlprefix = d.getVar('MLPREFIX', True) or ""
    for l in sorted(locales):
        ln = legitimize_package_name(l)
        pkg = pn + '-locale-' + ln
        packages.append(pkg)
        files = ''
        for transvar in d.getVar('QT_TRANSLATION_FILES', True).split():
            files = '%s %s' % (files, transvar.replace('*.qm', '*_%s.qm' % l))
        d.setVar('FILES_' + pkg, files )
        d.setVar('RRECOMMENDS_' + pkg, '%svirtual-locale-%s' % (mlprefix, ln))
        d.setVar('RPROVIDES_' + pkg, '%s-locale %s%s-translation' % (pn, mlprefix, ln))
        d.setVar('SUMMARY_' + pkg, '%s - %s translations' % (summary, l))
        d.setVar('DESCRIPTION_' + pkg, '%s  This package contains language translation files for the %s locale.' % (description, l))
        if locale_section:
            d.setVar('SECTION_' + pkg, locale_section)

    d.setVar('PACKAGES', ' '.join(packages))
}

PACKAGESPLITFUNCS_prepend = "qt_do_split_locales "

